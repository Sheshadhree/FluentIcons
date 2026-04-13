package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Phone48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Phone48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.25f, 4f)
            curveTo(13.903f, 4f, 12f, 5.903f, 12f, 8.25f)
            verticalLineToRelative(31.5f)
            curveToRelative(0f, 2.347f, 1.903f, 4.25f, 4.25f, 4.25f)
            horizontalLineToRelative(15.5f)
            curveToRelative(2.347f, 0f, 4.25f, -1.903f, 4.25f, -4.25f)
            verticalLineTo(8.25f)
            curveTo(36f, 5.903f, 34.097f, 4f, 31.75f, 4f)
            horizontalLineToRelative(-15.5f)
            close()
            moveTo(14.5f, 8.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(15.5f)
            curveToRelative(0.967f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineToRelative(31.5f)
            curveToRelative(0f, 0.967f, -0.783f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-15.5f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.783f, -1.75f, -1.75f)
            verticalLineTo(8.25f)
            close()
            moveToRelative(6.75f, 27.25f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveTo(20.56f, 38f, 21.25f, 38f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineToRelative(-5.5f)
            close()
        }
    }.build()
}
