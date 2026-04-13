package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Autosum24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Autosum24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.06f, 4.457f)
            curveTo(5.176f, 4.18f, 5.449f, 4f, 5.75f, 4f)
            horizontalLineToRelative(12.5f)
            curveTo(18.664f, 4f, 19f, 4.336f, 19f, 4.75f)
            reflectiveCurveTo(18.664f, 5.5f, 18.25f, 5.5f)
            horizontalLineTo(7.52f)
            lineToRelative(5.36f, 5.539f)
            curveToRelative(0.27f, 0.278f, 0.282f, 0.716f, 0.03f, 1.01f)
            lineTo(7.38f, 18.5f)
            horizontalLineToRelative(10.87f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(18.664f, 20f, 18.25f, 20f)
            horizontalLineTo(5.75f)
            curveToRelative(-0.293f, 0f, -0.559f, -0.17f, -0.681f, -0.437f)
            curveToRelative(-0.123f, -0.266f, -0.079f, -0.579f, 0.112f, -0.801f)
            lineToRelative(6.146f, -7.17f)
            lineToRelative(-6.116f, -6.32f)
            curveTo(5.001f, 5.055f, 4.942f, 4.734f, 5.06f, 4.457f)
            close()
        }
    }.build()
}
