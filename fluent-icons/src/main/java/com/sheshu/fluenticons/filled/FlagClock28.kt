package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlagClock28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlagClock28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 18f)
            horizontalLineToRelative(7.927f)
            curveToRelative(1.03f, -2.913f, 3.808f, -5f, 7.073f, -5f)
            curveToRelative(0.34f, 0f, 0.674f, 0.023f, 1.002f, 0.066f)
            lineTo(19.886f, 10.5f)
            lineToRelative(3.999f, -6.35f)
            curveTo(24.199f, 3.65f, 23.84f, 3f, 23.25f, 3f)
            horizontalLineTo(4.75f)
            curveTo(4.336f, 3f, 4f, 3.336f, 4f, 3.75f)
            verticalLineToRelative(20.5f)
            curveTo(4f, 24.664f, 4.336f, 25f, 4.75f, 25f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(18f)
            close()
            moveTo(27f, 20.5f)
            curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
            reflectiveCurveTo(14f, 24.09f, 14f, 20.5f)
            reflectiveCurveToRelative(2.91f, -6.5f, 6.5f, -6.5f)
            reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
            close()
            moveToRelative(-6.5f, -4f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(23.776f, 20f, 23.5f, 20f)
            horizontalLineTo(21f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            close()
        }
    }.build()
}
