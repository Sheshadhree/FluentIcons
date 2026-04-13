package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.EqualOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EqualOff16",
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
            lineTo(3.793f, 4.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 4.5f, 2f, 4.836f, 2f, 5.25f)
            reflectiveCurveTo(2.336f, 6f, 2.75f, 6f)
            horizontalLineToRelative(2.543f)
            lineToRelative(3.5f, 3.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 9.5f, 2f, 9.836f, 2f, 10.25f)
            reflectiveCurveTo(2.336f, 11f, 2.75f, 11f)
            horizontalLineToRelative(7.543f)
            close()
            moveToRelative(1.328f, -1.5f)
            lineToRelative(1.5f, 1.5f)
            horizontalLineToRelative(0.129f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(13.664f, 9.5f, 13.25f, 9.5f)
            horizontalLineToRelative(-1.629f)
            close()
            moveToRelative(-5f, -5f)
            lineToRelative(1.5f, 1.5f)
            horizontalLineToRelative(5.129f)
            curveTo(13.664f, 6f, 14f, 5.664f, 14f, 5.25f)
            reflectiveCurveTo(13.664f, 4.5f, 13.25f, 4.5f)
            horizontalLineTo(6.621f)
            close()
        }
    }.build()
}
