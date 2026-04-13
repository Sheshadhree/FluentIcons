package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowRouting24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowRouting24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.53f, 3.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(2.97f, 2.97f)
            horizontalLineTo(14.5f)
            curveToRelative(-1.795f, 0f, -3.25f, 1.455f, -3.25f, 3.25f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.822f, -0.566f, 1.511f, -1.33f, 1.7f)
            curveTo(9.549f, 13.373f, 7.935f, 12f, 6f, 12f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            curveToRelative(1.963f, 0f, 3.596f, -1.414f, 3.935f, -3.279f)
            curveToRelative(1.59f, -0.212f, 2.815f, -1.574f, 2.815f, -3.221f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(4.94f)
            lineToRelative(-2.97f, 2.97f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(4.25f, -4.25f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-4.25f, -4.25f)
            close()
        }
    }.build()
}
