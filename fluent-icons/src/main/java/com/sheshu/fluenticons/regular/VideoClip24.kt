package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.VideoClip24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.VideoClip24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6.25f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            horizontalLineToRelative(13.5f)
            curveTo(20.545f, 3f, 22f, 4.455f, 22f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 21f, 2f, 19.545f, 2f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(5.25f, 4.5f)
            curveTo(4.284f, 4.5f, 3.5f, 5.284f, 3.5f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(13.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(6.25f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            horizontalLineTo(5.25f)
            close()
            moveTo(9f, 9.25f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.76f, 0.816f, 1.243f, 1.482f, 0.876f)
            lineToRelative(5f, -2.75f)
            curveToRelative(0.69f, -0.38f, 0.69f, -1.372f, 0f, -1.752f)
            lineToRelative(-5f, -2.75f)
            curveTo(9.816f, 8.008f, 9f, 8.49f, 9f, 9.252f)
            close()
        }
    }.build()
}
