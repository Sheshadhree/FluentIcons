package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Timer24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Timer24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 5f)
            curveToRelative(4.694f, 0f, 8.5f, 3.806f, 8.5f, 8.5f)
            reflectiveCurveTo(16.694f, 22f, 12f, 22f)
            reflectiveCurveToRelative(-8.5f, -3.806f, -8.5f, -8.5f)
            reflectiveCurveTo(7.306f, 5f, 12f, 5f)
            close()
            moveToRelative(0f, 3f)
            curveToRelative(-0.38f, 0f, -0.694f, 0.282f, -0.743f, 0.648f)
            lineTo(11.25f, 8.75f)
            verticalLineToRelative(4.5f)
            lineToRelative(0.007f, 0.102f)
            curveTo(11.307f, 13.718f, 11.62f, 14f, 12f, 14f)
            reflectiveCurveToRelative(0.694f, -0.282f, 0.743f, -0.648f)
            lineToRelative(0.007f, -0.102f)
            verticalLineToRelative(-4.5f)
            lineToRelative(-0.007f, -0.102f)
            curveTo(12.693f, 8.282f, 12.38f, 8f, 12f, 8f)
            close()
            moveToRelative(7.17f, -2.877f)
            lineToRelative(0.082f, 0.061f)
            lineToRelative(1.149f, 1f)
            curveToRelative(0.312f, 0.272f, 0.345f, 0.746f, 0.073f, 1.058f)
            curveToRelative(-0.25f, 0.287f, -0.668f, 0.338f, -0.977f, 0.135f)
            lineToRelative(-0.081f, -0.061f)
            lineToRelative(-1.149f, -1f)
            curveToRelative(-0.313f, -0.272f, -0.345f, -0.746f, -0.073f, -1.058f)
            curveToRelative(0.249f, -0.287f, 0.668f, -0.338f, 0.976f, -0.135f)
            close()
            moveTo(14.25f, 2.5f)
            curveTo(14.664f, 2.5f, 15f, 2.836f, 15f, 3.25f)
            curveToRelative(0f, 0.38f, -0.282f, 0.693f, -0.648f, 0.743f)
            lineTo(14.25f, 4f)
            horizontalLineToRelative(-4.5f)
            curveTo(9.336f, 4f, 9f, 3.664f, 9f, 3.25f)
            curveToRelative(0f, -0.38f, 0.282f, -0.693f, 0.648f, -0.743f)
            lineTo(9.75f, 2.5f)
            horizontalLineToRelative(4.5f)
            close()
        }
    }.build()
}
