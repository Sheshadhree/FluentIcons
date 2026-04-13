package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NoteAdd24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NoteAdd24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 6.5f)
            curveTo(12f, 3.462f, 9.538f, 1f, 6.5f, 1f)
            reflectiveCurveTo(1f, 3.462f, 1f, 6.5f)
            reflectiveCurveTo(3.462f, 12f, 6.5f, 12f)
            reflectiveCurveTo(12f, 9.538f, 12f, 6.5f)
            close()
            moveTo(7f, 7f)
            lineToRelative(0.001f, 2.504f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineTo(7f)
            horizontalLineTo(3.496f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveTo(3.22f, 6f, 3.496f, 6f)
            horizontalLineTo(6f)
            verticalLineTo(3.5f)
            curveTo(6f, 3.222f, 6.224f, 3f, 6.5f, 3f)
            reflectiveCurveTo(7f, 3.222f, 7f, 3.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(2.503f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(9.779f, 7f, 9.503f, 7f)
            horizontalLineTo(7.001f)
            close()
            moveToRelative(-0.5f, 6f)
            curveToRelative(3.59f, 0f, 6.5f, -2.91f, 6.5f, -6.5f)
            curveToRelative(0f, -1.289f, -0.375f, -2.49f, -1.022f, -3.5f)
            horizontalLineToRelative(5.772f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(13f)
            horizontalLineToRelative(-4.75f)
            curveTo(14.455f, 13f, 13f, 14.455f, 13f, 16.25f)
            verticalLineTo(21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineToRelative(-5.772f)
            curveTo(4.01f, 12.625f, 5.211f, 13f, 6.5f, 13f)
            close()
            moveToRelative(14.06f, 1.5f)
            lineToRelative(-6.06f, 6.06f)
            verticalLineToRelative(-4.31f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(4.31f)
            close()
        }
    }.build()
}
