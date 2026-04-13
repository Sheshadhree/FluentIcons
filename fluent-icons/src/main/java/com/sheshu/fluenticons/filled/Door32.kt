package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Door32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Door32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.75f, 2f)
            curveTo(25.545f, 2f, 27f, 3.455f, 27f, 5.25f)
            verticalLineToRelative(21.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(8.25f)
            curveToRelative(-1.739f, 0f, -3.16f, -1.366f, -3.246f, -3.083f)
            lineTo(5f, 26.75f)
            verticalLineTo(5.25f)
            curveTo(5f, 3.455f, 6.455f, 2f, 8.25f, 2f)
            horizontalLineToRelative(15.5f)
            close()
            moveTo(10.5f, 13.75f)
            curveToRelative(-0.966f, 0f, -1.75f, 0.784f, -1.75f, 1.75f)
            reflectiveCurveToRelative(0.784f, 1.75f, 1.75f, 1.75f)
            reflectiveCurveToRelative(1.75f, -0.784f, 1.75f, -1.75f)
            reflectiveCurveToRelative(-0.784f, -1.75f, -1.75f, -1.75f)
            close()
        }
    }.build()
}
