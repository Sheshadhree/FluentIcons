package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LeafOne24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LeafOne24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.037f, 3.048f)
            curveToRelative(0.68f, -0.448f, 1.603f, -0.374f, 2.2f, 0.224f)
            lineToRelative(3.712f, 3.712f)
            curveToRelative(2.733f, 2.733f, 2.733f, 7.164f, 0f, 9.897f)
            curveToRelative(-0.147f, 0.147f, -0.299f, 0.286f, -0.455f, 0.418f)
            curveToRelative(-0.39f, 0.327f, -0.809f, 0.606f, -1.246f, 0.835f)
            curveToRelative(-0.787f, 0.412f, -1.635f, 0.665f, -2.498f, 0.757f)
            verticalLineToRelative(2.359f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-2.36f)
            curveToRelative(-1.534f, -0.164f, -3.023f, -0.834f, -4.199f, -2.01f)
            curveToRelative(-2.733f, -2.733f, -2.733f, -7.164f, 0f, -9.897f)
            lineToRelative(3.712f, -3.712f)
            curveToRelative(0.085f, -0.085f, 0.177f, -0.16f, 0.274f, -0.224f)
            close()
            moveTo(12f, 11f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.335f, -0.75f, 0.75f)
            verticalLineToRelative(5.63f)
            curveToRelative(0.498f, 0.068f, 1.002f, 0.068f, 1.5f, 0f)
            verticalLineToRelative(-5.63f)
            curveToRelative(0f, -0.415f, -0.336f, -0.75f, -0.75f, -0.75f)
            close()
        }
    }.build()
}
