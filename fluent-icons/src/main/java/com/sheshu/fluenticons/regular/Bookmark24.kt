package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Bookmark24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Bookmark24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.19f, 21.855f)
            curveToRelative(-0.495f, 0.357f, -1.187f, 0.002f, -1.187f, -0.61f)
            verticalLineTo(6.25f)
            curveTo(5.003f, 4.455f, 6.458f, 3f, 8.253f, 3f)
            horizontalLineToRelative(7.498f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            verticalLineToRelative(14.996f)
            curveToRelative(0f, 0.611f, -0.692f, 0.966f, -1.188f, 0.609f)
            lineToRelative(-5.81f, -4.181f)
            lineToRelative(-5.812f, 4.18f)
            close()
            moveTo(17.502f, 6.25f)
            curveToRelative(0f, -0.966f, -0.783f, -1.75f, -1.75f, -1.75f)
            horizontalLineTo(8.253f)
            curveToRelative(-0.967f, 0f, -1.75f, 0.784f, -1.75f, 1.75f)
            verticalLineToRelative(13.532f)
            lineToRelative(5.061f, -3.641f)
            curveToRelative(0.262f, -0.188f, 0.614f, -0.188f, 0.876f, 0f)
            lineToRelative(5.061f, 3.641f)
            verticalLineTo(6.25f)
            close()
        }
    }.build()
}
