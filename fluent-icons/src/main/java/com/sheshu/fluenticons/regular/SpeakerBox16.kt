package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SpeakerBox16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SpeakerBox16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 3.5f)
            curveTo(3f, 2.12f, 4.12f, 1f, 5.5f, 1f)
            horizontalLineToRelative(5f)
            curveTo(11.88f, 1f, 13f, 2.12f, 13f, 3.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-5f)
            curveTo(4.12f, 15f, 3f, 13.88f, 3f, 12.5f)
            verticalLineToRelative(-9f)
            close()
            moveTo(5.5f, 2f)
            curveTo(4.672f, 2f, 4f, 2.672f, 4f, 3.5f)
            verticalLineToRelative(9f)
            curveTo(4f, 13.328f, 4.672f, 14f, 5.5f, 14f)
            horizontalLineToRelative(5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-9f)
            curveTo(12f, 2.672f, 11.328f, 2f, 10.5f, 2f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(8f, 8.5f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(8.828f, 8.5f, 8f, 8.5f)
            close()
            moveTo(5.5f, 10f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(8f, 6f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveTo(8.552f, 4f, 8f, 4f)
            reflectiveCurveTo(7f, 4.448f, 7f, 5f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
