package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FastForward24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FastForward24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 5.503f)
            curveToRelative(0f, -1.28f, 1.498f, -1.971f, 2.472f, -1.142f)
            lineToRelative(7.41f, 6.306f)
            curveToRelative(0.821f, 0.699f, 0.821f, 1.966f, 0f, 2.665f)
            lineToRelative(-7.41f, 6.306f)
            curveToRelative(-0.974f, 0.83f, -2.472f, 0.137f, -2.472f, -1.142f)
            verticalLineToRelative(-3.987f)
            lineToRelative(-6.028f, 5.13f)
            curveTo(4.498f, 20.468f, 3f, 19.776f, 3f, 18.497f)
            verticalLineTo(5.504f)
            curveToRelative(0f, -1.28f, 1.498f, -1.972f, 2.472f, -1.143f)
            lineToRelative(6.028f, 5.13f)
            verticalLineTo(5.504f)
            close()
            moveToRelative(0f, 5.958f)
            lineToRelative(-7f, -5.957f)
            verticalLineToRelative(12.993f)
            lineToRelative(7f, -5.957f)
            verticalLineToRelative(-1.08f)
            close()
            moveToRelative(8.91f, 0.348f)
            lineTo(13f, 5.503f)
            verticalLineToRelative(12.993f)
            lineToRelative(7.41f, -6.306f)
            curveToRelative(0.117f, -0.1f, 0.117f, -0.281f, 0f, -0.38f)
            close()
        }
    }.build()
}
