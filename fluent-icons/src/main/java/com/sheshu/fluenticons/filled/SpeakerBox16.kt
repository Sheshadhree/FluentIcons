package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SpeakerBox16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SpeakerBox16",
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
            moveTo(9f, 5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(7f, 4.448f, 7f, 5f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            close()
            moveToRelative(-2.5f, 5f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveTo(9.5f, 9.172f, 9.5f, 10f)
            reflectiveCurveTo(8.828f, 11.5f, 8f, 11.5f)
            reflectiveCurveTo(6.5f, 10.828f, 6.5f, 10f)
            close()
            moveTo(8f, 7.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveTo(9.38f, 7.5f, 8f, 7.5f)
            close()
        }
    }.build()
}
