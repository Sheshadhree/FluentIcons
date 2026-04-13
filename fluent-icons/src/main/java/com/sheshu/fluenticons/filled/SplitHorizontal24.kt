package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SplitHorizontal24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SplitHorizontal24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.25f, 12.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(21.664f, 11f, 21.25f, 11f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 11f, 2f, 11.336f, 2f, 11.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(18.5f)
            close()
            moveTo(17.75f, 2f)
            curveTo(18.993f, 2f, 20f, 3.007f, 20f, 4.25f)
            verticalLineTo(10f)
            horizontalLineTo(4f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineToRelative(11.5f)
            close()
            moveTo(4f, 19.25f)
            verticalLineTo(13.5f)
            horizontalLineToRelative(16f)
            verticalLineToRelative(5.75f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 21.5f, 4f, 20.493f, 4f, 19.25f)
            close()
        }
    }.build()
}
