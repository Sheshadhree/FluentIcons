package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NoteEdit24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NoteEdit24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineToRelative(4.915f)
            lineToRelative(0.356f, -1.423f)
            curveToRelative(0.162f, -0.648f, 0.497f, -1.24f, 0.97f, -1.712f)
            lineToRelative(5.902f, -5.903f)
            curveToRelative(0.714f, -0.713f, 1.674f, -1.03f, 2.607f, -0.95f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(11f)
            verticalLineToRelative(4.75f)
            curveTo(11f, 9.545f, 9.545f, 11f, 7.75f, 11f)
            horizontalLineTo(3f)
            verticalLineToRelative(6.75f)
            close()
            moveTo(9.5f, 3.44f)
            lineTo(3.44f, 9.5f)
            horizontalLineToRelative(4.31f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(3.44f)
            close()
            moveToRelative(9.6f, 9.23f)
            lineToRelative(-5.903f, 5.902f)
            curveToRelative(-0.344f, 0.344f, -0.588f, 0.775f, -0.706f, 1.247f)
            lineToRelative(-0.458f, 1.831f)
            curveToRelative(-0.199f, 0.796f, 0.523f, 1.517f, 1.319f, 1.318f)
            lineToRelative(1.83f, -0.457f)
            curveToRelative(0.473f, -0.118f, 0.904f, -0.363f, 1.248f, -0.707f)
            lineToRelative(5.902f, -5.902f)
            curveToRelative(0.893f, -0.893f, 0.893f, -2.34f, 0f, -3.232f)
            curveToRelative(-0.892f, -0.893f, -2.34f, -0.893f, -3.232f, 0f)
            close()
        }
    }.build()
}
