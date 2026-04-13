package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonFeedback24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonFeedback24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.77f, 12.4f)
            curveToRelative(0.15f, 0.07f, 0.32f, 0.1f, 0.48f, 0.1f)
            curveToRelative(0.33f, 0f, 0.64f, -0.13f, 0.88f, -0.36f)
            lineTo(18.31f, 10f)
            horizontalLineToRelative(0.94f)
            curveTo(20.77f, 10f, 22f, 8.77f, 22f, 7.25f)
            verticalLineToRelative(-2.5f)
            curveTo(22f, 3.23f, 20.77f, 2f, 19.25f, 2f)
            horizontalLineToRelative(-4.5f)
            curveTo(13.23f, 2f, 12f, 3.23f, 12f, 4.75f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 1.26f, 0.85f, 2.32f, 2f, 2.65f)
            verticalLineToRelative(1.35f)
            curveToRelative(0f, 0.5f, 0.31f, 0.95f, 0.77f, 1.15f)
            close()
            moveTo(8f, 13.5f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            reflectiveCurveTo(6.07f, 6.5f, 8f, 6.5f)
            reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
            reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
            close()
            moveTo(8f, 22f)
            curveToRelative(-2.06f, 0f, -3.64f, -0.56f, -4.7f, -1.67f)
            curveToRelative(-1.336f, -1.404f, -1.303f, -3.174f, -1.3f, -3.357f)
            verticalLineTo(16.96f)
            curveTo(2f, 15.89f, 2.9f, 15f, 4f, 15f)
            horizontalLineToRelative(8f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            lineToRelative(0.001f, 0.006f)
            curveToRelative(0.003f, 0.127f, 0.045f, 1.91f, -1.3f, 3.324f)
            curveTo(11.64f, 21.44f, 10.06f, 22f, 8f, 22f)
            close()
        }
    }.build()
}
