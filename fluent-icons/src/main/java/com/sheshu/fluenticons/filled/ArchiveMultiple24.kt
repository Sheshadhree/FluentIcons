package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArchiveMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArchiveMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 2f)
            curveTo(3.784f, 2f, 3f, 2.784f, 3f, 3.75f)
            verticalLineToRelative(1.5f)
            curveTo(3f, 6.216f, 3.784f, 7f, 4.75f, 7f)
            horizontalLineToRelative(13.5f)
            curveTo(19.216f, 7f, 20f, 6.216f, 20f, 5.25f)
            verticalLineToRelative(-1.5f)
            curveTo(20f, 2.784f, 19.216f, 2f, 18.25f, 2f)
            horizontalLineTo(4.75f)
            close()
            moveTo(19f, 8f)
            horizontalLineTo(4f)
            verticalLineToRelative(7.75f)
            curveToRelative(0f, 2.071f, 1.679f, 3.75f, 3.75f, 3.75f)
            horizontalLineToRelative(7.5f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(8f)
            close()
            moveTo(9f, 11.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(3.477f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(13.641f, 12f, 13.227f, 12f)
            horizontalLineTo(9.75f)
            curveTo(9.336f, 12f, 9f, 11.664f, 9f, 11.25f)
            close()
            moveToRelative(12.5f, 0.5f)
            curveToRelative(0f, -1.227f, -0.589f, -2.316f, -1.5f, -3f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 2.347f, -1.902f, 4.25f, -4.25f, 4.25f)
            horizontalLineToRelative(-8.5f)
            curveToRelative(0.684f, 0.91f, 1.773f, 1.5f, 3f, 1.5f)
            horizontalLineToRelative(5.5f)
            curveToRelative(3.176f, 0f, 5.75f, -2.574f, 5.75f, -5.75f)
            verticalLineToRelative(-4.5f)
            close()
        }
    }.build()
}
