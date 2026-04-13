package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Clipboard28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Clipboard28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.45f, 4f)
            horizontalLineToRelative(1.8f)
            curveTo(21.769f, 4f, 23f, 5.231f, 23f, 6.75f)
            verticalLineToRelative(16.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(7.75f)
            curveTo(6.231f, 26f, 5f, 24.769f, 5f, 23.25f)
            verticalLineTo(6.75f)
            curveTo(5f, 5.231f, 6.231f, 4f, 7.75f, 4f)
            horizontalLineToRelative(1.8f)
            curveTo(9.782f, 2.859f, 10.79f, 2f, 12f, 2f)
            horizontalLineToRelative(4f)
            curveToRelative(1.21f, 0f, 2.218f, 0.859f, 2.45f, 2f)
            close()
            moveTo(11f, 4.5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            close()
        }
    }.build()
}
