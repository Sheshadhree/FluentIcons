package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LinkMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LinkMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 4f)
            curveTo(3.35f, 4f, 1f, 6.35f, 1f, 9.25f)
            curveToRelative(0f, 2.303f, 1.483f, 4.26f, 3.547f, 4.967f)
            curveToRelative(0.06f, -0.51f, 0.181f, -1f, 0.353f, -1.467f)
            curveToRelative(-1.404f, -0.542f, -2.4f, -1.905f, -2.4f, -3.5f)
            curveToRelative(0f, -2.071f, 1.679f, -3.75f, 3.75f, -3.75f)
            horizontalLineToRelative(6.5f)
            curveToRelative(2.071f, 0f, 3.75f, 1.679f, 3.75f, 3.75f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineToRelative(-1f)
            curveTo(11.336f, 13f, 11f, 13.336f, 11f, 13.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(1f)
            curveToRelative(2.9f, 0f, 5.25f, -2.35f, 5.25f, -5.25f)
            reflectiveCurveTo(15.65f, 4f, 12.75f, 4f)
            horizontalLineToRelative(-6.5f)
            close()
            moveToRelative(13.14f, 6.196f)
            curveToRelative(-0.092f, 0.5f, -0.243f, 0.98f, -0.443f, 1.434f)
            curveTo(20.42f, 12.042f, 21.5f, 13.395f, 21.5f, 15f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.933f, 0f, -3.5f, -1.567f, -3.5f, -3.5f)
            reflectiveCurveToRelative(1.567f, -3.5f, 3.5f, -3.5f)
            horizontalLineToRelative(1.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(12.664f, 10f, 12.25f, 10f)
            horizontalLineTo(11f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            horizontalLineToRelative(7f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            curveToRelative(0f, -2.279f, -1.524f, -4.202f, -3.61f, -4.804f)
            close()
        }
    }.build()
}
