package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StreetSign20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StreetSign20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(2.379f)
            curveToRelative(0.53f, 0f, 1.039f, 0.21f, 1.414f, 0.586f)
            lineToRelative(2.06f, 2.06f)
            curveTo(16.948f, 7.74f, 17f, 7.867f, 17f, 8f)
            curveToRelative(0f, 0.133f, -0.053f, 0.26f, -0.146f, 0.354f)
            lineToRelative(-2.061f, 2.06f)
            curveTo(14.418f, 10.79f, 13.909f, 11f, 13.379f, 11f)
            horizontalLineTo(11f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(8f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-6f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(7f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(2f)
            verticalLineTo(4f)
            close()
            moveToRelative(3f, 0f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(8f, 3.448f, 8f, 4f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(2f)
            verticalLineTo(4f)
            close()
            moveTo(8f, 17f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-6f)
            horizontalLineTo(8f)
            verticalLineToRelative(6f)
            close()
        }
    }.build()
}
