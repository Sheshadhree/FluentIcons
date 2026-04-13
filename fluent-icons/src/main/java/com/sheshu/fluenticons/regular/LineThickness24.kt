package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LineThickness24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LineThickness24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 3.5f)
            curveTo(2.336f, 3.5f, 2f, 3.836f, 2f, 4.25f)
            reflectiveCurveTo(2.336f, 5f, 2.75f, 5f)
            horizontalLineToRelative(18.5f)
            curveTo(21.664f, 5f, 22f, 4.664f, 22f, 4.25f)
            reflectiveCurveTo(21.664f, 3.5f, 21.25f, 3.5f)
            horizontalLineTo(2.75f)
            close()
            moveTo(2f, 10.75f)
            curveTo(2f, 10.06f, 2.56f, 9.5f, 3.25f, 9.5f)
            horizontalLineToRelative(17.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(21.44f, 12f, 20.75f, 12f)
            horizontalLineTo(3.25f)
            curveTo(2.56f, 12f, 2f, 11.44f, 2f, 10.75f)
            close()
            moveToRelative(0f, 7.5f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(16.5f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            reflectiveCurveTo(21.216f, 20f, 20.25f, 20f)
            horizontalLineTo(3.75f)
            curveTo(2.784f, 20f, 2f, 19.216f, 2f, 18.25f)
            close()
        }
    }.build()
}
