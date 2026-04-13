package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.EqualOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EqualOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.293f, 11f)
            lineToRelative(3.853f, 3.854f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-13f, -13f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(4.293f, 5f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 5f, 2f, 5.224f, 2f, 5.5f)
            reflectiveCurveTo(2.224f, 6f, 2.5f, 6f)
            horizontalLineToRelative(2.793f)
            lineToRelative(4f, 4f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 10f, 2f, 10.224f, 2f, 10.5f)
            reflectiveCurveTo(2.224f, 11f, 2.5f, 11f)
            horizontalLineToRelative(7.793f)
            close()
            moveToRelative(1.828f, -1f)
            lineToRelative(1f, 1f)
            horizontalLineTo(13.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 10f, 13.5f, 10f)
            horizontalLineToRelative(-1.379f)
            close()
            moveToRelative(-5f, -5f)
            lineToRelative(1f, 1f)
            horizontalLineTo(13.5f)
            curveTo(13.776f, 6f, 14f, 5.776f, 14f, 5.5f)
            reflectiveCurveTo(13.776f, 5f, 13.5f, 5f)
            horizontalLineTo(7.121f)
            close()
        }
    }.build()
}
