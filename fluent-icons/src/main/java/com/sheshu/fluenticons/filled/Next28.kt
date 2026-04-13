package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Next28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Next28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.5f, 3.75f)
            curveTo(23.5f, 3.336f, 23.836f, 3f, 24.25f, 3f)
            reflectiveCurveTo(25f, 3.336f, 25f, 3.75f)
            verticalLineToRelative(20.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(3.75f)
            close()
            moveTo(3f, 5.254f)
            curveTo(3f, 3.438f, 5.041f, 2.37f, 6.533f, 3.406f)
            lineToRelative(12.504f, 8.68f)
            curveToRelative(1.284f, 0.891f, 1.29f, 2.787f, 0.013f, 3.688f)
            lineToRelative(-12.504f, 8.81f)
            curveTo(5.056f, 25.634f, 3f, 24.57f, 3f, 22.745f)
            verticalLineTo(5.254f)
            close()
        }
    }.build()
}
