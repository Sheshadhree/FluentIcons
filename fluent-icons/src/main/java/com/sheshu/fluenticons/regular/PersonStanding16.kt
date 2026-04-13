package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PersonStanding16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonStanding16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.342f, 4.535f)
            curveTo(9.597f, 4.17f, 9.75f, 3.728f, 9.75f, 3.25f)
            curveTo(9.75f, 2.009f, 8.74f, 1f, 7.5f, 1f)
            reflectiveCurveTo(5.25f, 2.009f, 5.25f, 3.25f)
            curveToRelative(0f, 0.478f, 0.152f, 0.92f, 0.408f, 1.285f)
            curveTo(4.719f, 4.699f, 4f, 5.515f, 4f, 6.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.551f, 0.448f, 1f, 1f, 1f)
            verticalLineToRelative(3f)
            curveTo(5f, 14.327f, 5.673f, 15f, 6.5f, 15f)
            horizontalLineToRelative(2f)
            curveToRelative(0.827f, 0f, 1.5f, -0.673f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0.552f, 0f, 1f, -0.449f, 1f, -1f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.986f, -0.718f, -1.802f, -1.658f, -1.965f)
            close()
            moveTo(7.5f, 2f)
            curveToRelative(0.689f, 0f, 1.25f, 0.561f, 1.25f, 1.25f)
            reflectiveCurveTo(8.189f, 4.5f, 7.5f, 4.5f)
            reflectiveCurveTo(6.25f, 3.939f, 6.25f, 3.25f)
            reflectiveCurveTo(6.811f, 2f, 7.5f, 2f)
            close()
            moveTo(10f, 9.5f)
            horizontalLineTo(9f)
            verticalLineToRelative(4f)
            curveTo(9f, 13.776f, 8.775f, 14f, 8.5f, 14f)
            horizontalLineTo(8f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            reflectiveCurveTo(7f, 10.724f, 7f, 11f)
            verticalLineToRelative(3f)
            horizontalLineTo(6.5f)
            curveTo(6.225f, 14f, 6f, 13.776f, 6f, 13.5f)
            verticalLineToRelative(-4f)
            horizontalLineTo(5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.551f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(3f)
            curveToRelative(0.552f, 0f, 1f, 0.449f, 1f, 1f)
            verticalLineToRelative(3f)
            close()
        }
    }.build()
}
