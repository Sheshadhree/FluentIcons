package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HomeGarage24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HomeGarage24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.456f, 2.534f)
            curveToRelative(-0.84f, -0.712f, -2.072f, -0.712f, -2.912f, 0f)
            lineToRelative(-6.75f, 5.728f)
            curveTo(3.291f, 8.689f, 3f, 9.316f, 3f, 9.977f)
            verticalLineToRelative(9.273f)
            curveTo(3f, 20.216f, 3.784f, 21f, 4.75f, 21f)
            horizontalLineTo(6.5f)
            verticalLineToRelative(-6.25f)
            curveTo(6.5f, 13.784f, 7.284f, 13f, 8.25f, 13f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineTo(21f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(9.977f)
            curveToRelative(0f, -0.66f, -0.29f, -1.288f, -0.794f, -1.715f)
            lineToRelative(-6.75f, -5.728f)
            close()
            moveTo(16f, 21f)
            horizontalLineTo(8f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(8f)
            verticalLineTo(21f)
            close()
            moveToRelative(0f, -4f)
            horizontalLineTo(8f)
            verticalLineToRelative(-2.25f)
            curveToRelative(0f, -0.138f, 0.112f, -0.25f, 0.25f, -0.25f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.138f, 0f, 0.25f, 0.112f, 0.25f, 0.25f)
            verticalLineTo(17f)
            close()
        }
    }.build()
}
