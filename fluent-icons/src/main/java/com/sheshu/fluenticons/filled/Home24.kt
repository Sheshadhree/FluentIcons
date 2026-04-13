package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Home24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Home24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.45f, 2.533f)
            curveToRelative(-0.837f, -0.707f, -2.063f, -0.707f, -2.9f, 0f)
            lineTo(3.8f, 8.228f)
            curveTo(3.291f, 8.655f, 3f, 9.284f, 3f, 9.948f)
            verticalLineToRelative(9.305f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(3f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(15.25f)
            curveToRelative(0f, -0.68f, 0.542f, -1.232f, 1.217f, -1.25f)
            horizontalLineToRelative(2.566f)
            curveToRelative(0.675f, 0.018f, 1.217f, 0.57f, 1.217f, 1.25f)
            verticalLineToRelative(4.003f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(3f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(9.947f)
            curveToRelative(0f, -0.662f, -0.292f, -1.292f, -0.8f, -1.72f)
            lineToRelative(-6.75f, -5.694f)
            close()
        }
    }.build()
}
