package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableSimpleCheckmark48: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableSimpleCheckmark48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 6f)
            horizontalLineToRelative(10.75f)
            verticalLineToRelative(16.75f)
            horizontalLineTo(6f)
            verticalLineTo(12f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            close()
            moveTo(6f, 25.25f)
            horizontalLineToRelative(16.75f)
            verticalLineTo(42f)
            horizontalLineTo(12f)
            curveToRelative(-3.314f, 0f, -6f, -2.686f, -6f, -6f)
            verticalLineTo(25.25f)
            close()
            moveToRelative(19.25f, 0f)
            verticalLineTo(42f)
            horizontalLineTo(36f)
            curveToRelative(3.314f, 0f, 6f, -2.686f, 6f, -6f)
            verticalLineTo(25.25f)
            horizontalLineTo(25.25f)
            close()
            moveToRelative(0f, -19.25f)
            verticalLineToRelative(16.75f)
            horizontalLineTo(42f)
            verticalLineTo(12f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            horizontalLineTo(25.25f)
            close()
            moveToRelative(13.13f, 25.634f)
            lineToRelative(-5.5f, 5.5f)
            curveToRelative(-0.488f, 0.488f, -1.28f, 0.488f, -1.768f, 0f)
            lineToRelative(-2.746f, -2.746f)
            curveToRelative(-0.488f, -0.488f, -0.488f, -1.28f, 0f, -1.768f)
            reflectiveCurveToRelative(1.28f, -0.488f, 1.768f, 0f)
            lineToRelative(1.862f, 1.862f)
            lineToRelative(4.616f, -4.616f)
            curveToRelative(0.488f, -0.488f, 1.28f, -0.488f, 1.768f, 0f)
            reflectiveCurveToRelative(0.488f, 1.28f, 0f, 1.768f)
            close()
        }
    }.build()
}
