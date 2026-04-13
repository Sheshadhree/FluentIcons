package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LineThickness20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LineThickness20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 4f)
            curveTo(2.336f, 4f, 2f, 4.336f, 2f, 4.75f)
            reflectiveCurveTo(2.336f, 5.5f, 2.75f, 5.5f)
            horizontalLineToRelative(14.5f)
            curveTo(17.664f, 5.5f, 18f, 5.164f, 18f, 4.75f)
            reflectiveCurveTo(17.664f, 4f, 17.25f, 4f)
            horizontalLineTo(2.75f)
            close()
            moveTo(2f, 9.25f)
            curveTo(2f, 8.56f, 2.56f, 8f, 3.25f, 8f)
            horizontalLineToRelative(13.5f)
            curveTo(17.44f, 8f, 18f, 8.56f, 18f, 9.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(3.25f)
            curveTo(2.56f, 10.5f, 2f, 9.94f, 2f, 9.25f)
            close()
            moveToRelative(0f, 5.5f)
            curveTo(2f, 13.784f, 2.784f, 13f, 3.75f, 13f)
            horizontalLineToRelative(12.5f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            reflectiveCurveToRelative(-0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(3.75f)
            curveTo(2.784f, 16.5f, 2f, 15.716f, 2f, 14.75f)
            close()
        }
    }.build()
}
