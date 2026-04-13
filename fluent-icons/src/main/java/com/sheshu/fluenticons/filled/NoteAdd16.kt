package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NoteAdd16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NoteAdd16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 5.5f)
            curveTo(10f, 7.985f, 7.985f, 10f, 5.5f, 10f)
            reflectiveCurveTo(1f, 7.985f, 1f, 5.5f)
            reflectiveCurveTo(3.015f, 1f, 5.5f, 1f)
            reflectiveCurveTo(10f, 3.015f, 10f, 5.5f)
            close()
            moveToRelative(-4f, -2f)
            curveTo(6f, 3.224f, 5.776f, 3f, 5.5f, 3f)
            reflectiveCurveTo(5f, 3.224f, 5f, 3.5f)
            verticalLineTo(5f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 5f, 3f, 5.224f, 3f, 5.5f)
            reflectiveCurveTo(3.224f, 6f, 3.5f, 6f)
            horizontalLineTo(5f)
            verticalLineToRelative(1.5f)
            curveTo(5f, 7.776f, 5.224f, 8f, 5.5f, 8f)
            reflectiveCurveTo(6f, 7.776f, 6f, 7.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(1.5f)
            curveTo(7.776f, 6f, 8f, 5.776f, 8f, 5.5f)
            reflectiveCurveTo(7.776f, 5f, 7.5f, 5f)
            horizontalLineTo(6f)
            verticalLineTo(3.5f)
            close()
            moveTo(5.5f, 11f)
            curveTo(8.538f, 11f, 11f, 8.538f, 11f, 5.5f)
            curveToRelative(0f, -0.9f, -0.216f, -1.75f, -0.6f, -2.5f)
            horizontalLineToRelative(2.1f)
            curveTo(13.88f, 3f, 15f, 4.12f, 15f, 5.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            verticalLineToRelative(3f)
            horizontalLineTo(5.5f)
            curveTo(4.12f, 15f, 3f, 13.88f, 3f, 12.5f)
            verticalLineToRelative(-2.1f)
            curveTo(3.75f, 10.784f, 4.6f, 11f, 5.5f, 11f)
            close()
            moveToRelative(4.5f, 3.985f)
            curveToRelative(0.319f, -0.046f, 0.616f, -0.194f, 0.846f, -0.424f)
            lineToRelative(3.715f, -3.715f)
            curveToRelative(0.23f, -0.23f, 0.378f, -0.527f, 0.424f, -0.846f)
            horizontalLineTo(12f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(2.985f)
            close()
        }
    }.build()
}
