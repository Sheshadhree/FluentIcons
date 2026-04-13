package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ErrorCircle12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ErrorCircle12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 11f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            reflectiveCurveTo(8.761f, 1f, 6f, 1f)
            reflectiveCurveTo(1f, 3.239f, 1f, 6f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            close()
            moveTo(5.25f, 8.25f)
            curveTo(5.25f, 7.836f, 5.586f, 7.5f, 6f, 7.5f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(6.414f, 9f, 6f, 9f)
            reflectiveCurveTo(5.25f, 8.664f, 5.25f, 8.25f)
            close()
            moveToRelative(0.258f, -4.84f)
            curveTo(5.55f, 3.177f, 5.755f, 3f, 6f, 3f)
            reflectiveCurveToRelative(0.45f, 0.177f, 0.492f, 0.41f)
            lineTo(6.5f, 3.5f)
            verticalLineTo(6f)
            lineTo(6.492f, 6.09f)
            curveTo(6.45f, 6.323f, 6.245f, 6.5f, 6f, 6.5f)
            reflectiveCurveTo(5.55f, 6.323f, 5.508f, 6.09f)
            lineTo(5.5f, 6f)
            verticalLineTo(3.5f)
            lineToRelative(0.008f, -0.09f)
            close()
        }
    }.build()
}
