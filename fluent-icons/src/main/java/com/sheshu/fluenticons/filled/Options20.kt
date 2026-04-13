package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Options20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Options20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.25f, 5f)
            horizontalLineToRelative(-2.364f)
            curveToRelative(-0.319f, -1.014f, -1.267f, -1.75f, -2.386f, -1.75f)
            curveToRelative(-1.12f, 0f, -2.067f, 0.736f, -2.386f, 1.75f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 5f, 2f, 5.336f, 2f, 5.75f)
            reflectiveCurveTo(2.336f, 6.5f, 2.75f, 6.5f)
            horizontalLineToRelative(7.364f)
            curveToRelative(0.319f, 1.014f, 1.267f, 1.75f, 2.386f, 1.75f)
            curveToRelative(1.12f, 0f, 2.067f, -0.736f, 2.386f, -1.75f)
            horizontalLineToRelative(2.364f)
            curveTo(17.664f, 6.5f, 18f, 6.164f, 18f, 5.75f)
            reflectiveCurveTo(17.664f, 5f, 17.25f, 5f)
            close()
            moveToRelative(-14.5f, 8.5f)
            curveTo(2.336f, 13.5f, 2f, 13.836f, 2f, 14.25f)
            reflectiveCurveTo(2.336f, 15f, 2.75f, 15f)
            horizontalLineToRelative(2.364f)
            curveToRelative(0.319f, 1.014f, 1.267f, 1.75f, 2.386f, 1.75f)
            curveToRelative(1.12f, 0f, 2.067f, -0.736f, 2.386f, -1.75f)
            horizontalLineToRelative(7.364f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(9.886f)
            curveToRelative(-0.319f, -1.014f, -1.267f, -1.75f, -2.386f, -1.75f)
            curveToRelative(-1.12f, 0f, -2.067f, 0.736f, -2.386f, 1.75f)
            horizontalLineTo(2.75f)
            close()
        }
    }.build()
}
