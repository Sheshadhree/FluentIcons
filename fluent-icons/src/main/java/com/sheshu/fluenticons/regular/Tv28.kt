package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Tv28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Tv28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.254f, 4f)
            curveToRelative(-1.794f, 0f, -3.25f, 1.455f, -3.25f, 3.25f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 1.795f, 1.455f, 3.25f, 3.25f, 3.25f)
            horizontalLineToRelative(17.497f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(7.25f)
            curveToRelative(0f, -1.795f, -1.455f, -3.25f, -3.25f, -3.25f)
            horizontalLineTo(5.254f)
            close()
            moveToRelative(-1.75f, 3.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(17.497f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.967f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(5.254f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.783f, -1.75f, -1.75f)
            verticalLineTo(7.25f)
            close()
            moveTo(6.75f, 23f)
            curveTo(6.336f, 23f, 6f, 23.336f, 6f, 23.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(14.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(21.664f, 23f, 21.25f, 23f)
            horizontalLineTo(6.75f)
            close()
        }
    }.build()
}
