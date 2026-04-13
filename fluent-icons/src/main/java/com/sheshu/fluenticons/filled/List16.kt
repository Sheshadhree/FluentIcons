package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.List16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.List16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 3.75f)
            curveTo(2f, 3.336f, 2.336f, 3f, 2.75f, 3f)
            horizontalLineToRelative(7.5f)
            curveTo(10.664f, 3f, 11f, 3.336f, 11f, 3.75f)
            reflectiveCurveTo(10.664f, 4.5f, 10.25f, 4.5f)
            horizontalLineToRelative(-7.5f)
            curveTo(2.336f, 4.5f, 2f, 4.164f, 2f, 3.75f)
            close()
            moveToRelative(0f, 8f)
            curveTo(2f, 11.336f, 2.336f, 11f, 2.75f, 11f)
            horizontalLineToRelative(6.5f)
            curveTo(9.664f, 11f, 10f, 11.336f, 10f, 11.75f)
            reflectiveCurveTo(9.664f, 12.5f, 9.25f, 12.5f)
            horizontalLineToRelative(-6.5f)
            curveTo(2.336f, 12.5f, 2f, 12.164f, 2f, 11.75f)
            close()
            moveTo(2.75f, 7f)
            curveTo(2.336f, 7f, 2f, 7.336f, 2f, 7.75f)
            reflectiveCurveTo(2.336f, 8.5f, 2.75f, 8.5f)
            horizontalLineToRelative(10.5f)
            curveTo(13.664f, 8.5f, 14f, 8.164f, 14f, 7.75f)
            reflectiveCurveTo(13.664f, 7f, 13.25f, 7f)
            horizontalLineTo(2.75f)
            close()
        }
    }.build()
}
