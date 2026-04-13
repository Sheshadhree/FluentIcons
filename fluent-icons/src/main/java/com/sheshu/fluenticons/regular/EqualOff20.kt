package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.EqualOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EqualOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.853f, 2.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineTo(6.293f, 7f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 7f, 3f, 7.224f, 3f, 7.5f)
            reflectiveCurveTo(3.224f, 8f, 3.5f, 8f)
            horizontalLineToRelative(3.793f)
            lineToRelative(4f, 4f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 12f, 3f, 12.224f, 3f, 12.5f)
            reflectiveCurveTo(3.224f, 13f, 3.5f, 13f)
            horizontalLineToRelative(8.793f)
            lineToRelative(4.853f, 4.854f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            close()
            moveTo(14.122f, 12f)
            lineToRelative(1f, 1f)
            horizontalLineTo(16.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(16.776f, 12f, 16.5f, 12f)
            horizontalLineToRelative(-2.379f)
            close()
            moveToRelative(-5f, -5f)
            lineToRelative(1f, 1f)
            horizontalLineTo(16.5f)
            curveTo(16.776f, 8f, 17f, 7.776f, 17f, 7.5f)
            reflectiveCurveTo(16.776f, 7f, 16.5f, 7f)
            horizontalLineTo(9.121f)
            close()
        }
    }.build()
}
