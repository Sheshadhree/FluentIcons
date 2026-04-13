package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Clock12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Clock12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 1f)
            curveToRelative(2.761f, 0f, 5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.239f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.239f, -5f, -5f)
            reflectiveCurveToRelative(2.239f, -5f, 5f, -5f)
            close()
            moveTo(5.5f, 3.5f)
            curveTo(5.224f, 3.5f, 5f, 3.724f, 5f, 4f)
            verticalLineToRelative(2.5f)
            curveTo(5f, 6.776f, 5.224f, 7f, 5.5f, 7f)
            horizontalLineToRelative(2f)
            curveTo(7.776f, 7f, 8f, 6.776f, 8f, 6.5f)
            reflectiveCurveTo(7.776f, 6f, 7.5f, 6f)
            horizontalLineTo(6f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            close()
        }
    }.build()
}
