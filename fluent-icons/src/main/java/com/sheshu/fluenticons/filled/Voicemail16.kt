package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Voicemail16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Voicemail16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 7.75f)
            curveTo(5f, 7.336f, 5.336f, 7f, 5.75f, 7f)
            reflectiveCurveTo(6.5f, 7.336f, 6.5f, 7.75f)
            reflectiveCurveTo(6.164f, 8.5f, 5.75f, 8.5f)
            reflectiveCurveTo(5f, 8.164f, 5f, 7.75f)
            close()
            moveToRelative(4.5f, 0f)
            curveTo(9.5f, 7.336f, 9.836f, 7f, 10.25f, 7f)
            reflectiveCurveTo(11f, 7.336f, 11f, 7.75f)
            reflectiveCurveTo(10.664f, 8.5f, 10.25f, 8.5f)
            reflectiveCurveTo(9.5f, 8.164f, 9.5f, 7.75f)
            close()
            moveTo(3.5f, 3f)
            curveTo(2.672f, 3f, 2f, 3.672f, 2f, 4.5f)
            verticalLineTo(11f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(4.5f)
            curveTo(14f, 3.672f, 13.328f, 3f, 12.5f, 3f)
            horizontalLineToRelative(-9f)
            close()
            moveToRelative(4f, 4.75f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            reflectiveCurveTo(4f, 8.716f, 4f, 7.75f)
            reflectiveCurveTo(4.784f, 6f, 5.75f, 6f)
            horizontalLineToRelative(4.5f)
            curveTo(11.216f, 6f, 12f, 6.784f, 12f, 7.75f)
            reflectiveCurveTo(11.216f, 9.5f, 10.25f, 9.5f)
            reflectiveCurveTo(8.5f, 8.716f, 8.5f, 7.75f)
            curveTo(8.5f, 7.482f, 8.56f, 7.227f, 8.668f, 7f)
            horizontalLineTo(7.332f)
            curveTo(7.44f, 7.227f, 7.5f, 7.482f, 7.5f, 7.75f)
            close()
        }
    }.build()
}
