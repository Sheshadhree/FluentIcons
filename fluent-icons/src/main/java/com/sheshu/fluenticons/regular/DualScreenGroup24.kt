package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DualScreenGroup24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DualScreenGroup24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.755f, 4.002f)
            verticalLineToRelative(0.002f)
            horizontalLineToRelative(7.498f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineTo(18.25f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-8.998f)
            verticalLineToRelative(-0.003f)
            horizontalLineTo(3.758f)
            curveToRelative(-0.967f, 0f, -1.75f, -0.783f, -1.75f, -1.75f)
            verticalLineTo(5.752f)
            curveToRelative(0f, -0.967f, 0.783f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(8.997f)
            close()
            moveToRelative(7.498f, 1.502f)
            horizontalLineToRelative(-7.498f)
            verticalLineTo(18.5f)
            horizontalLineToRelative(7.498f)
            curveToRelative(0.138f, 0f, 0.25f, -0.112f, 0.25f, -0.25f)
            verticalLineTo(5.754f)
            curveToRelative(0f, -0.138f, -0.112f, -0.25f, -0.25f, -0.25f)
            close()
            moveToRelative(-8.998f, -0.002f)
            horizontalLineTo(3.758f)
            curveToRelative(-0.138f, 0f, -0.25f, 0.112f, -0.25f, 0.25f)
            verticalLineToRelative(12.495f)
            curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
            horizontalLineToRelative(7.497f)
            verticalLineTo(5.502f)
            close()
        }
    }.build()
}
