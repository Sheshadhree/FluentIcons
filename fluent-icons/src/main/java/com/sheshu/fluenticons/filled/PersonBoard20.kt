package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonBoard20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonBoard20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 3f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(6f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            close()
            moveToRelative(4.75f, 3.25f)
            curveTo(10.75f, 7.216f, 9.966f, 8f, 9f, 8f)
            reflectiveCurveTo(7.25f, 7.216f, 7.25f, 6.25f)
            reflectiveCurveTo(8.034f, 4.5f, 9f, 4.5f)
            reflectiveCurveToRelative(1.75f, 0.784f, 1.75f, 1.75f)
            close()
            moveToRelative(1.75f, 4f)
            curveToRelative(0f, 0.588f, -0.146f, 2.5f, -3.502f, 2.5f)
            reflectiveCurveTo(5.5f, 10.821f, 5.5f, 10.25f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            close()
            moveTo(5.764f, 16f)
            curveToRelative(0.55f, 0.614f, 1.348f, 1f, 2.236f, 1f)
            horizontalLineToRelative(4.5f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineTo(8f)
            curveToRelative(0f, -0.888f, -0.386f, -1.687f, -1f, -2.236f)
            verticalLineTo(12.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineTo(5.764f)
            close()
        }
    }.build()
}
