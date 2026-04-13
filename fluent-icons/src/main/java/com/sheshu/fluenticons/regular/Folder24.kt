package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Folder24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Folder24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 6.25f)
            verticalLineTo(8f)
            horizontalLineToRelative(4.629f)
            curveToRelative(0.199f, 0f, 0.39f, -0.079f, 0.53f, -0.22f)
            lineToRelative(1.53f, -1.53f)
            lineToRelative(-1.53f, -1.53f)
            curveTo(8.519f, 4.579f, 8.328f, 4.5f, 8.129f, 4.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 4.5f, 3.5f, 5.284f, 3.5f, 6.25f)
            close()
            moveToRelative(-1.5f, 0f)
            curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
            horizontalLineToRelative(2.879f)
            curveToRelative(0.596f, 0f, 1.169f, 0.237f, 1.59f, 0.659f)
            lineTo(11.562f, 5.5f)
            horizontalLineToRelative(7.189f)
            curveTo(20.545f, 5.5f, 22f, 6.955f, 22f, 8.75f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 21f, 2f, 19.545f, 2f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(3.5f, 9.5f)
            verticalLineToRelative(8.25f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(13.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-9f)
            curveTo(20.5f, 7.784f, 19.716f, 7f, 18.75f, 7f)
            horizontalLineToRelative(-7.19f)
            lineTo(9.72f, 8.841f)
            curveTo(9.298f, 9.263f, 8.725f, 9.5f, 8.129f, 9.5f)
            horizontalLineTo(3.5f)
            close()
        }
    }.build()
}
