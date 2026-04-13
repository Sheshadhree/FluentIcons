package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NumberCircle124: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberCircle124",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 22f)
            curveToRelative(5.523f, 0f, 10f, -4.477f, 10f, -10f)
            reflectiveCurveTo(17.523f, 2f, 12f, 2f)
            reflectiveCurveTo(2f, 6.477f, 2f, 12f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            close()
            moveToRelative(1.5f, -14.75f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(12f, 16.664f, 12f, 16.25f)
            verticalLineTo(10.1f)
            curveToRelative(-0.548f, 0.588f, -1.235f, 1.102f, -2.013f, 1.361f)
            curveToRelative(-0.393f, 0.131f, -0.817f, -0.08f, -0.948f, -0.474f)
            curveToRelative(-0.131f, -0.393f, 0.081f, -0.818f, 0.474f, -0.948f)
            curveToRelative(0.572f, -0.191f, 1.149f, -0.644f, 1.623f, -1.23f)
            curveToRelative(0.475f, -0.586f, 0.783f, -1.228f, 0.879f, -1.706f)
            curveToRelative(0.075f, -0.378f, 0.425f, -0.637f, 0.81f, -0.6f)
            curveToRelative(0.382f, 0.04f, 0.675f, 0.362f, 0.675f, 0.747f)
            close()
        }
    }.build()
}
