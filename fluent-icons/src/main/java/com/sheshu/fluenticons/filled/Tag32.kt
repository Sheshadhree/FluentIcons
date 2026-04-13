package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Tag32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tag32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.636f, 3.952f)
            curveTo(16.246f, 3.342f, 17.072f, 3f, 17.934f, 3f)
            horizontalLineToRelative(7.818f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            verticalLineToRelative(7.818f)
            curveToRelative(0f, 0.862f, -0.342f, 1.689f, -0.952f, 2.298f)
            lineToRelative(-11.68f, 11.68f)
            curveToRelative(-1.27f, 1.27f, -3.327f, 1.27f, -4.596f, 0f)
            lineToRelative(-7.818f, -7.818f)
            curveToRelative(-1.27f, -1.27f, -1.27f, -3.327f, 0f, -4.596f)
            lineToRelative(11.68f, -11.68f)
            close()
            moveTo(23f, 11f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
        }
    }.build()
}
