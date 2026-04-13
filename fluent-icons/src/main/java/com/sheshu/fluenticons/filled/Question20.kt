package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Question20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Question20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 3f)
            curveTo(7.796f, 3f, 6f, 4.796f, 6f, 7f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(7.5f, 7.414f, 7.5f, 7f)
            curveToRelative(0f, -1.376f, 1.124f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.124f, 2.5f, 2.5f)
            curveToRelative(0f, 0.597f, -0.156f, 0.975f, -0.368f, 1.27f)
            curveToRelative(-0.232f, 0.325f, -0.547f, 0.58f, -0.969f, 0.92f)
            lineToRelative(-0.01f, 0.008f)
            curveToRelative(-0.4f, 0.323f, -0.893f, 0.724f, -1.27f, 1.288f)
            curveTo(9.493f, 11.074f, 9.25f, 11.8f, 9.25f, 12.75f)
            verticalLineToRelative(0.5f)
            curveTo(9.25f, 13.664f, 9.586f, 14f, 10f, 14f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.674f, 0.164f, -1.105f, 0.382f, -1.432f)
            curveToRelative(0.233f, -0.349f, 0.552f, -0.62f, 0.964f, -0.953f)
            lineToRelative(0.068f, -0.055f)
            curveToRelative(0.374f, -0.302f, 0.834f, -0.672f, 1.188f, -1.167f)
            curveTo(13.75f, 8.588f, 14f, 7.903f, 14f, 7f)
            curveToRelative(0f, -2.204f, -1.796f, -4f, -4f, -4f)
            close()
            moveToRelative(0f, 14f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
