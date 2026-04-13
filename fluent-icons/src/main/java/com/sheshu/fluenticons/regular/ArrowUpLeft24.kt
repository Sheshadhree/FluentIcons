package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUpLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUpLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.246f, 3f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(13.66f, 4.5f, 13.246f, 4.5f)
            horizontalLineTo(5.577f)
            lineToRelative(15.2f, 15.2f)
            curveToRelative(0.298f, 0.298f, 0.298f, 0.782f, 0f, 1.081f)
            curveToRelative(-0.299f, 0.299f, -0.783f, 0.299f, -1.082f, 0f)
            lineTo(4.496f, 5.581f)
            verticalLineToRelative(7.669f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-9.5f)
            curveTo(2.996f, 3.336f, 3.332f, 3f, 3.746f, 3f)
            horizontalLineToRelative(9.5f)
            close()
        }
    }.build()
}
