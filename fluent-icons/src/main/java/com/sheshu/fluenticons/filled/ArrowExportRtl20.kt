package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowExportRtl20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowExportRtl20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.25f, 3.75f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(18f, 15.914f, 18f, 15.5f)
            verticalLineToRelative(-11f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            close()
            moveTo(15f, 10f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(4.06f)
            lineToRelative(2.72f, -2.72f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(1.723f, 9.466f)
            lineTo(1.688f, 9.504f)
            curveToRelative(-0.05f, 0.056f, -0.09f, 0.12f, -0.12f, 0.185f)
            curveTo(1.523f, 9.784f, 1.5f, 9.89f, 1.5f, 10f)
            curveToRelative(0f, 0.112f, 0.025f, 0.219f, 0.069f, 0.314f)
            curveToRelative(0.03f, 0.064f, 0.068f, 0.124f, 0.116f, 0.179f)
            lineToRelative(0.038f, 0.041f)
            lineTo(5.72f, 14.53f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-2.72f, -2.72f)
            horizontalLineToRelative(10.19f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            close()
        }
    }.build()
}
