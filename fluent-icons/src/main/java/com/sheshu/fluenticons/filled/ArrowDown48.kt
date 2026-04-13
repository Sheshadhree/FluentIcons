package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowDown48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDown48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25.5f, 5.25f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(31.835f)
            lineTo(10.32f, 24.698f)
            curveToRelative(-0.581f, -0.59f, -1.531f, -0.598f, -2.122f, -0.018f)
            curveToRelative(-0.59f, 0.581f, -0.598f, 1.531f, -0.018f, 2.122f)
            lineToRelative(14.75f, 15f)
            lineToRelative(0.031f, 0.03f)
            curveToRelative(0.27f, 0.259f, 0.636f, 0.418f, 1.039f, 0.418f)
            curveToRelative(0.4f, 0f, 0.763f, -0.157f, 1.032f, -0.411f)
            lineToRelative(0.038f, -0.037f)
            lineToRelative(14.75f, -15f)
            curveToRelative(0.58f, -0.591f, 0.572f, -1.54f, -0.018f, -2.122f)
            curveToRelative(-0.591f, -0.58f, -1.54f, -0.572f, -2.121f, 0.018f)
            lineTo(25.5f, 37.085f)
            verticalLineTo(5.25f)
            close()
        }
    }.build()
}
