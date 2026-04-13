package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableSimpleInclude16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableSimpleInclude16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(5.264f)
            curveTo(7.338f, 7.417f, 7.417f, 7.338f, 7.5f, 7.264f)
            verticalLineTo(2f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(2f, 8.5f)
            horizontalLineToRelative(4.67f)
            curveTo(6.56f, 8.813f, 6.5f, 9.15f, 6.5f, 9.5f)
            verticalLineTo(12f)
            curveToRelative(0f, 0.768f, 0.289f, 1.47f, 0.764f, 2f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-3f)
            close()
            moveToRelative(12f, -4f)
            verticalLineToRelative(2.764f)
            curveTo(13.47f, 6.789f, 12.768f, 6.5f, 12f, 6.5f)
            horizontalLineTo(9.5f)
            curveToRelative(-0.35f, 0f, -0.687f, 0.06f, -1f, 0.17f)
            verticalLineTo(2f)
            horizontalLineToRelative(3f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            close()
            moveTo(7.5f, 9.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(3f)
            curveTo(13.216f, 7.5f, 14f, 8.284f, 14f, 9.25f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            verticalLineToRelative(-3f)
            close()
        }
    }.build()
}
