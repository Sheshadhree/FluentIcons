package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Info12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Info12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 6f)
            curveToRelative(0f, 2.761f, -2.239f, 5f, -5f, 5f)
            reflectiveCurveTo(1f, 8.761f, 1f, 6f)
            reflectiveCurveToRelative(2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            close()
            moveTo(5.5f, 6.5f)
            verticalLineTo(8f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(6.5f, 8.276f, 6.5f, 8f)
            verticalLineTo(6.5f)
            curveTo(6.5f, 6.224f, 6.276f, 6f, 6f, 6f)
            reflectiveCurveTo(5.5f, 6.224f, 5.5f, 6.5f)
            close()
            moveTo(6f, 3.75f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(5.586f, 5.25f, 6f, 5.25f)
            reflectiveCurveTo(6.75f, 4.914f, 6.75f, 4.5f)
            reflectiveCurveTo(6.414f, 3.75f, 6f, 3.75f)
            close()
        }
    }.build()
}
