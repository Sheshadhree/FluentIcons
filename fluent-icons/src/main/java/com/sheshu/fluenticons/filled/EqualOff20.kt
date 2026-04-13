package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.EqualOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EqualOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.853f, 2.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineTo(5.793f, 6.5f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 6.5f, 3f, 6.836f, 3f, 7.25f)
            reflectiveCurveTo(3.336f, 8f, 3.75f, 8f)
            horizontalLineToRelative(3.543f)
            lineToRelative(3.5f, 3.5f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 11.5f, 3f, 11.836f, 3f, 12.25f)
            reflectiveCurveTo(3.336f, 13f, 3.75f, 13f)
            horizontalLineToRelative(8.543f)
            lineToRelative(4.853f, 4.854f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            close()
            moveTo(13.622f, 11.5f)
            lineToRelative(1.5f, 1.5f)
            horizontalLineToRelative(1.129f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-2.629f)
            close()
            moveToRelative(-5f, -5f)
            lineToRelative(1.5f, 1.5f)
            horizontalLineToRelative(6.129f)
            curveTo(16.664f, 8f, 17f, 7.664f, 17f, 7.25f)
            reflectiveCurveTo(16.664f, 6.5f, 16.25f, 6.5f)
            horizontalLineTo(8.621f)
            close()
        }
    }.build()
}
