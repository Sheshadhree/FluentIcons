package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowImport20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowImport20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.25f, 3.75f)
            curveTo(17.664f, 3.75f, 18f, 4.086f, 18f, 4.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-11f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            close()
            moveTo(2f, 10f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(10.19f)
            lineToRelative(-2.72f, -2.72f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(3.997f, 3.996f)
            lineToRelative(0.035f, 0.038f)
            curveToRelative(0.05f, 0.056f, 0.09f, 0.12f, 0.12f, 0.185f)
            curveTo(15.477f, 9.784f, 15.5f, 9.89f, 15.5f, 10f)
            curveToRelative(0f, 0.112f, -0.025f, 0.219f, -0.069f, 0.314f)
            curveToRelative(-0.03f, 0.064f, -0.068f, 0.124f, -0.116f, 0.179f)
            lineToRelative(-0.038f, 0.041f)
            lineToRelative(-3.997f, 3.996f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(2.72f, -2.72f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 10.75f, 2f, 10.414f, 2f, 10f)
            close()
        }
    }.build()
}
