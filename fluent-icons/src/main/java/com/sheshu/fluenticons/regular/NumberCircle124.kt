package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.NumberCircle124: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NumberCircle124",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 7.25f)
            curveToRelative(0f, -0.386f, -0.292f, -0.708f, -0.676f, -0.746f)
            curveToRelative(-0.384f, -0.038f, -0.734f, 0.22f, -0.81f, 0.599f)
            curveToRelative(-0.095f, 0.478f, -0.403f, 1.12f, -0.878f, 1.706f)
            curveToRelative(-0.474f, 0.586f, -1.051f, 1.039f, -1.623f, 1.23f)
            curveToRelative(-0.393f, 0.13f, -0.605f, 0.555f, -0.474f, 0.948f)
            curveToRelative(0.13f, 0.393f, 0.555f, 0.605f, 0.948f, 0.474f)
            curveToRelative(0.778f, -0.259f, 1.465f, -0.773f, 2.013f, -1.36f)
            verticalLineToRelative(6.149f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-9f)
            close()
            moveTo(12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.477f, 10f, -10f)
            reflectiveCurveTo(17.523f, 2f, 12f, 2f)
            close()
            moveTo(3.5f, 12f)
            curveToRelative(0f, -4.694f, 3.806f, -8.5f, 8.5f, -8.5f)
            reflectiveCurveToRelative(8.5f, 3.806f, 8.5f, 8.5f)
            reflectiveCurveToRelative(-3.806f, 8.5f, -8.5f, 8.5f)
            reflectiveCurveToRelative(-8.5f, -3.806f, -8.5f, -8.5f)
            close()
        }
    }.build()
}
