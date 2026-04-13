package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Laptop48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Laptop48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.25f, 8f)
            curveTo(9.903f, 8f, 8f, 9.903f, 8f, 12.25f)
            verticalLineToRelative(15.5f)
            curveTo(8f, 30.097f, 9.903f, 32f, 12.25f, 32f)
            horizontalLineToRelative(23.5f)
            curveToRelative(2.347f, 0f, 4.25f, -1.903f, 4.25f, -4.25f)
            verticalLineToRelative(-15.5f)
            curveTo(40f, 9.903f, 38.097f, 8f, 35.75f, 8f)
            horizontalLineToRelative(-23.5f)
            close()
            moveToRelative(-1.75f, 4.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(23.5f)
            curveToRelative(0.967f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 0.966f, -0.783f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-23.5f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            verticalLineToRelative(-15.5f)
            close()
            moveTo(5.25f, 35.5f)
            curveTo(4.56f, 35.5f, 4f, 36.06f, 4f, 36.75f)
            reflectiveCurveTo(4.56f, 38f, 5.25f, 38f)
            horizontalLineToRelative(37.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(5.25f)
            close()
        }
    }.build()
}
