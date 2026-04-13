package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DualScreenHeader24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DualScreenHeader24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.748f, 4.002f)
            lineToRelative(-0.001f, 0.002f)
            horizontalLineToRelative(7.498f)
            curveToRelative(0.967f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineTo(18.25f)
            curveToRelative(0f, 0.966f, -0.783f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-8.997f)
            lineToRelative(-0.001f, -0.003f)
            horizontalLineTo(3.75f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.783f, -1.75f, -1.75f)
            verticalLineTo(5.752f)
            curveToRelative(0f, -0.967f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(8.998f)
            close()
            moveTo(20.495f, 7f)
            horizontalLineToRelative(-7.748f)
            verticalLineToRelative(11.5f)
            horizontalLineToRelative(7.498f)
            curveToRelative(0.138f, 0f, 0.25f, -0.112f, 0.25f, -0.25f)
            verticalLineTo(7f)
            close()
            moveToRelative(-9.248f, 0f)
            horizontalLineTo(3.5f)
            verticalLineToRelative(11.247f)
            curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
            horizontalLineToRelative(7.498f)
            lineTo(11.247f, 7f)
            close()
        }
    }.build()
}
