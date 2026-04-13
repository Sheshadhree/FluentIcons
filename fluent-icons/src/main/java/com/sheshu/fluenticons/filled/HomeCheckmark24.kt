package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HomeCheckmark24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HomeCheckmark24",
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
            horizontalLineToRelative(14.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(9.947f)
            curveToRelative(0f, -0.662f, -0.292f, -1.292f, -0.8f, -1.72f)
            lineToRelative(-6.75f, -5.694f)
            close()
            moveToRelative(2.334f, 8.747f)
            lineToRelative(-4.504f, 4.504f)
            curveToRelative(-0.14f, 0.14f, -0.331f, 0.22f, -0.53f, 0.22f)
            reflectiveCurveToRelative(-0.39f, -0.08f, -0.53f, -0.22f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.768f, 0f, -1.06f)
            curveToRelative(0.293f, -0.294f, 0.767f, -0.294f, 1.06f, 0f)
            lineToRelative(1.47f, 1.469f)
            lineToRelative(3.973f, -3.973f)
            curveToRelative(0.293f, -0.293f, 0.768f, -0.293f, 1.06f, 0f)
            curveToRelative(0.294f, 0.293f, 0.294f, 0.767f, 0f, 1.06f)
            close()
        }
    }.build()
}
