package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Phone48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Phone48",
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
            moveToRelative(5f, 31.5f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(27.44f, 38f, 26.75f, 38f)
            horizontalLineToRelative(-5.5f)
            curveTo(20.56f, 38f, 20f, 37.44f, 20f, 36.75f)
            reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
            close()
        }
    }.build()
}
