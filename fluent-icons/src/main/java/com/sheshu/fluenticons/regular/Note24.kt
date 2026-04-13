package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Note24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Note24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineToRelative(6.879f)
            curveToRelative(0f, 0.596f, -0.237f, 1.169f, -0.659f, 1.59f)
            lineToRelative(-5.621f, 5.622f)
            curveTo(14.298f, 20.763f, 13.725f, 21f, 13.129f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(11.5f)
            close()
            moveToRelative(0f, 1.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineTo(13f)
            verticalLineToRelative(-3.25f)
            curveToRelative(0f, -1.733f, 1.357f, -3.15f, 3.066f, -3.245f)
            lineTo(16.25f, 13f)
            horizontalLineToRelative(3.25f)
            verticalLineTo(6.25f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            close()
            moveToRelative(0.689f, 10f)
            horizontalLineTo(16.25f)
            curveToRelative(-0.918f, 0f, -1.671f, 0.707f, -1.744f, 1.607f)
            lineTo(14.5f, 16.25f)
            verticalLineToRelative(2.189f)
            lineToRelative(3.939f, -3.939f)
            close()
        }
    }.build()
}
